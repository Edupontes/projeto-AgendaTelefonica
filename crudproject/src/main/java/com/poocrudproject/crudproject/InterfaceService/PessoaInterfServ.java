package com.poocrudproject.crudproject.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.poocrudproject.crudproject.Model.Pessoa;

public interface PessoaInterfServ {
    public List<Pessoa> listar(); //listar todos os registros que estiver no banco
    public Optional<Pessoa> listarPeloId(int id); //vai listar todos os registros no banco, mas retornará apenas a pessoa = o id
    public int salvar(Pessoa p); //procedimento para salvar/editar um registro
    public void apagar(int id); //deletar um registro pelo id
}
