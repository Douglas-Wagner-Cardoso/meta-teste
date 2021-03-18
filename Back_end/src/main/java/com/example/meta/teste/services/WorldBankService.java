package com.example.meta.teste.services;

import com.example.meta.teste.modelsindices.Indices;
import com.example.meta.teste.modelspaises.Paises;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.XML;

import java.net.URI;
import java.net.URISyntaxException;


@Service
public class WorldBankService {

    public Paises buscarCodigosPaises(int pagina) {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            URI uri = new URI("http://api.worldbank.org/v2/country?page=" + pagina);
            RestTemplate restTemplate = new RestTemplate();
            String xml  = restTemplate.getForObject(uri, String.class);
            String json = XML.toJSONObject(xml).toString(4);

            return mapper.readValue(json, Paises.class);
        }
        catch(URISyntaxException e){
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;

    }

    public Indices buscarIndicesPaises(int pagina, String cod){
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            URI uri = new URI("http://api.worldbank.org/v2/country/"+ cod +"/indicator/SI.POV.DDAY?page=" + pagina);
            RestTemplate restTemplate = new RestTemplate();
            String xml  = restTemplate.getForObject(uri, String.class);
            String json = XML.toJSONObject(xml).toString(4);

            return mapper.readValue(json, Indices.class);
        }
        catch(URISyntaxException e){
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }



}
