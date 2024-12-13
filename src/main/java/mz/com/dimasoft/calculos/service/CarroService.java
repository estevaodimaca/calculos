package mz.com.dimasoft.calculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.com.dimasoft.calculos.entity.Carro;
import mz.com.dimasoft.calculos.entity.Marca;
import mz.com.dimasoft.calculos.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public String save(Carro carro) {

		this.carroRepository.save(carro);

		return "Carro salvo com sucesso";
	}

	public String update(Carro carro, Long id) {

		carro.setId(id);
		this.carroRepository.save(carro);

		return "Carro salvo com sucesso";
	}

	public String delete(Long id) {

		this.carroRepository.deleteById(id);

		return "Carro removido com sucesso";
	}

	public List<Carro> findAll() {
		return this.carroRepository.findAll();
	}

	public Carro findById(Long id) {
		return this.findById(id);
	}
	
	public List<Carro> findByMarca(long idMarca) {
		Marca marca  = new Marca();
		marca.setId(idMarca);
		return this.carroRepository.findByMarca(marca);
	}
	
	public List<Carro> findByNome(String nome) {
		return this.carroRepository.findByNome(nome);
	}

	public List<Carro> findAcimaAno(int ano) {
		// TODO Auto-generated method stub
		return this.carroRepository.findAcimaAno(ano);
	}
}
