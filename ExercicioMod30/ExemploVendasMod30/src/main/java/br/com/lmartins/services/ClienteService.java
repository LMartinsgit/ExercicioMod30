/**
 * 
 */
package br.com.lmartins.services;

import br.com.lmartins.dao.IClienteDAO;
import br.com.lmartins.domain.Cliente;
import br.com.lmartins.exceptions.DAOException;
import br.com.lmartins.exceptions.MaisDeUmRegistroException;
import br.com.lmartins.exceptions.TableException;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;
import br.com.lmartins.services.generic.GenericService;

/**
 * @author lucas
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
