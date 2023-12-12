/**
 * 
 */
package br.com.lmartins.services;

import br.com.lmartins.domain.Cliente;
import br.com.lmartins.exceptions.DAOException;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;
import br.com.lmartins.services.generic.IGenericService;

/**
 * @author lucas
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
