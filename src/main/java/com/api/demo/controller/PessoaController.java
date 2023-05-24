package com.api.demo.controller;

import com.api.demo.model.Pessoa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.demo.service.PessoaService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@Api("Api Pessoas")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;
    @CrossOrigin
    @GetMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> listaPessoa(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.listaPessoa());
    }
    @CrossOrigin
    @GetMapping("pessoa/{idpessoa}")
    @ApiOperation("Obter detalhes de um pessoa")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Pessoa encontrado"),
        @ApiResponse(code = 404, message = "Pessoa não encontrado")
    })
    public ResponseEntity<Optional<Pessoa>> getByIdPessoa(@PathVariable Integer idpessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.getByIdPessoa(idpessoa));
    }
    @CrossOrigin
    @PostMapping("pessoa")
    public ResponseEntity<Pessoa> salvaPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvaPessoa(pessoa));
    }
    @CrossOrigin
    @PutMapping("pessoa")
    public ResponseEntity<Pessoa> atualizaPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.atualizaPessoa(pessoa));
    }
    @CrossOrigin
    @DeleteMapping("pessoa/{idpessoa}")
    public ResponseEntity<String> deleteByIdPessoa(@PathVariable Integer idpessoa){
        pessoaService.deleteByIdPessoa(idpessoa);
        return ResponseEntity.status(HttpStatus.OK).body("Pessoa removido com sucesso");
    }    
}
