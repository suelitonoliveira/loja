package br.com.alura.microsservice.loja.client;

import br.com.alura.microsservice.loja.dto.InfoForncedorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("fornecedor")
public interface FornecedorClient {


    @RequestMapping("/info/{estado}")
    InfoForncedorDTO getInfoPorEstado(@PathVariable String estado);

}
