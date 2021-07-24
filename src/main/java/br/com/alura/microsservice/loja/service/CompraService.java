package br.com.alura.microsservice.loja.service;

import br.com.alura.microsservice.loja.client.FornecedorClient;
import br.com.alura.microsservice.loja.dto.CompraDTO;
import br.com.alura.microsservice.loja.dto.InfoForncedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;


    public void realizaCompra(CompraDTO compraDTO) {

        InfoForncedorDTO info = fornecedorClient.getInfoPorEstado(compraDTO.getEndereco().getEstado());

        System.out.println(info.getEndereco());
    }
}
