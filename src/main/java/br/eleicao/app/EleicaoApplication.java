package br.eleicao.app;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.ZonaRepository;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;

@SpringBootApplication
public class EleicaoApplication  implements CommandLineRunner {
	
	//final MunicipioRepository _municipioRepository;	//Criando propriedade da Interface Município
	//final EleitorRepository _eleitorRepository; //Criando propriedade da Interface Eleitor
	//final CandidatoRepository _candidatoRepository;
	final ZonaRepository _zonaRepository;
	
	public EleicaoApplication(ZonaRepository zonaRepository) {
		_zonaRepository = zonaRepository; //Alimentando a propriedade com a construção da classe 
	}
	
	/*
	 * public EleicaoApplication(CandidatoRepository candidatoRepository) {
	 * _candidatoRepository = candidatoRepository; //Alimentando a propriedade com a
	 * construção da classe }
	 */
	 
	/*
	 * public EleicaoApplication(EleitorRepository eleitorRepository) {
	 * _eleitorRepository = eleitorRepository; //Alimentando a propriedade com a
	 * construção da classe }
	 */
	
	/*
	 * public EleicaoApplication(MunicipioRepository municipioRepository) {
	 * _municipioRepository = municipioRepository; //Alimentando a propriedade com a
	 * construção da classe }
	 */

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		
		
		
		
		//==========================ZONA=========================================================================
		//INSERT TABELA ZONA
		/*
		 * Zona zona = new Zona(); zona.setNome("1234"); _zonaRepository.save(zona);
		 * System.out.println("Zona salva!");
		 * 
		 * zona = new Zona(); zona.setNome("5678"); _zonaRepository.save(zona);
		 * System.out.println("Zona salva!");
		 * 
		 * zona = new Zona(); zona.setNome("9012"); _zonaRepository.save(zona);
		 * System.out.println("Zona salva!");
		 */
		
		//UPDATE TABELA ZONA
		
		/*
		 * Zona zona = new Zona(); zona.setId(new Long(1)); zona.setNome("4321");
		 * _zonaRepository.save(zona);
		 * System.out.println("Zona atualizado com sucesso!");
		 */
		
		//DELETE COLUNA TABELA ZONA
		
		/*
		 * Zona zona = new Zona(); zona.setId(new Long(3));
		 * _zonaRepository.delete(zona);
		 * System.out.println("Zona deletado com sucesso!");
		 */
		
		//SELECT APENAS UM REGISTRO
		
		/*
		 * Optional<Zona> candidato = _zonaRepository.findById(new Long(2));
		 * System.out.println("Zona: " + zona.get().getNome());
		 */
		
		//SELECT TODOS OS REGISTROS
		
		/*
		 * Iterable<Zona> zona = _zonaRepository.findAll(); for (Zona z : zona) {
		 * System.out.println("Zona: " + z.getNome()); }
		 */
		//------------------------CANDIDATOS-------------------------------------------------------------------------
		
		
		  //INSERT de candidatos 
		
		 /* 
		 * Candidato candidato = new Candidato();
		 * candidato.setNumero("40640"); candidato.setNome("Caio França");
		 * candidato.setTipo_Candidato("Vereador");
		 * _candidatoRepository.save(candidato); System.out.println("Candidato salvo!");
		 * 
		 * candidato = new Candidato(); candidato.setNumero("40663");
		 * candidato.setNome("Fernando Bispo"); candidato.setTipo_Candidato("Vereador");
		 * _candidatoRepository.save(candidato); System.out.println("Candidato salvo!");
		 * 
		 * candidato = new Candidato(); candidato.setNumero("50");
		 * candidato.setNome("Guilherme Boulos");
		 * candidato.setTipo_Candidato("Prefeito");
		 * _candidatoRepository.save(candidato); System.out.println("Candidato salvo!");
		 * 
		 * candidato = new Candidato(); candidato.setNumero("13");
		 * candidato.setNome("Tatto"); candidato.setTipo_Candidato("Prefeito");
		 * _candidatoRepository.save(candidato); System.out.println("Candidato salvo!");
		 */
		
		// Atualizando um candidato
		
		/*
		 * Candidato candidato = new Candidato();
		 * candidato.setId(new Long(1)); candidato.setNome("Celso Russomano");
		 * candidato.setNumero("45"); _candidatoRepository.save(candidato);
		 * System.out.println("Candidato atualizado com sucesso!");
		 */
		
		//Deletando candidato 
		
		/*
		 * Candidato candidato = new Candidato();
		 * candidato.setId(new Long(3)); _candidatoRepository.delete(candidato);
		 * System.out.println("Candidato deletado com sucesso!");
		 */
		
		// Selecionando apenas UM candidato 
		/*
		 * Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
		 * System.out.println("Candidato: " + candidato.get().getNome());
		 * 
		 * // Selecionando todos os candidatos Iterable<Candidato> candidatos =
		 * _candidatoRepository.findAll(); for (Candidato c : candidatos) {
		 * System.out.println("Candidato: " + c.getNome()); }
		 */
		
		
		//-----------------------ELEITORES-----------------------------------------------------------------
		
			
		/*//INSERT de eleitor
		 * Eleitor eleitor = new Eleitor(); eleitor.setNome("Isabelly");
		 * _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor salvo com sucesso!");
		 * 
		 * eleitor = new Eleitor(); eleitor.setNome("Michelli");
		 * _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor salvo com sucesso!");
		 * 
		 * eleitor = new Eleitor(); eleitor.setNome("Luisa");
		 * _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor salvo com sucesso!");
		 */

		//Deletando eleitor
		
		/*
		 * Eleitor eleitor = new Eleitor(); eleitor.setId(new
		 * Long(3)); _eleitorRepository.delete(eleitor);
		 * System.out.println("Eleitor deletado com sucesso!");
		 */
		
		// Atualizando um eleitor
		
		/*
		 * Eleitor eleitor = new Eleitor();
		 * eleitor.setId(new Long(1)); eleitor.setNome("Isa");
		 * _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor atualizado com sucesso!");
		 */
		
		// Selecionando apenas UM eleitor 
		
		/*
		 * // Optional<Eleitor> eleitor =
		 * _eleitorRepository.findById(new Long(2)); System.out.println("Eleitor: " +
		 * eleitor.get().getNome());
		 * 
		 * // Selecionando todos os eleitorwa Iterable<Eleitor> eleitores =
		 * _eleitorRepository.findAll(); for (Eleitor e : eleitores) {
		 * System.out.println("Eleitor: " + e.getNome()); }
		 */
		
		//------------------------------------MUNICIPIO----------------------------------------------------------
		
			//INSERIR MUNICIPIOS
		/*
		 * Municipio municipio = new Municipio(); municipio.setNome("São Paulo");
		 * municipio.setPopulacao(14000000); _municipioRepository.save(municipio);
		 * System.out.println("Município salvo com sucesso!");
		 * 
		 * municipio = new Municipio(); municipio.setNome("Sorocaba");
		 * municipio.setPopulacao(140000); _municipioRepository.save(municipio);
		 * System.out.println("Município salvo com sucesso!");
		 * 
		 * municipio = new Municipio(); municipio.setNome("Guarulhos");
		 * municipio.setPopulacao(1400000); _municipioRepository.save(municipio);
		 * System.out.println("Município salvo com sucesso!");
		 */

		/*
		 * // Deletando um município 
		 * 
		 * Municipio municipio = new Municipio();
		 * municipio.setId(new Long(1)); _municipioRepository.delete(municipio);
		 * System.out.println("Município deletado com sucesso!");
		 * 
		 * // Atualizando um município /
		 * 
		 *  Municipio municipio = new Municipio();
		 * municipio.setId(new Long(2)); municipio.setNome("São Paulo");
		 * municipio.setPopulacao(14000000); _municipioRepository.save(municipio);
		 * System.out.println("Município atualizado com sucesso!"); Scanner leitor = new
		 * Scanner(System.in);
		 * 
		 * //System.out.print("Digite o código do município: "); //Long id
		 * =leitor.nextLong();
		 * 
		 * // Selecionando apenas UM município // 
		 * Optional<Municipio>municipio = _municipioRepository.findById(new Long(2)); System.out.println("Município: "
		 * + municipio.get().getNome());
		 * 
		 * // Selecionando todos os municípios 
		 * 
		 * Iterable<Municipio> municipios =
		 * _municipioRepository.findAll(); for(Municipio m : municipios) {
		 * System.out.println("Município: " + m.getNome()); }
		 */
		
	}

}
