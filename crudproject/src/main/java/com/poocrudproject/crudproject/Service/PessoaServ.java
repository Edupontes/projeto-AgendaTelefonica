package com.poocrudproject.crudproject.Service;

import java.util.List;
import java.util.Optional;

import com.poocrudproject.crudproject.InterfaceService.PessoaInterfServ;
import com.poocrudproject.crudproject.Interfaces.PessoaInterf;
import com.poocrudproject.crudproject.Model.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServ implements PessoaInterfServ {

    @Autowired
    private PessoaInterf data;

    @Override
    public List<Pessoa> listar() {
        return (List<Pessoa>)data.findAll();
    }

    @Override
    public Optional<Pessoa> listarPeloId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int salvar(Pessoa p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void apagar(int id) {
        // TODO Auto-generated method stub

    }

}
