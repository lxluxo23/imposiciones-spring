package lxdeveloper.monsalvecespedes.imposiciones;

import lxdeveloper.monsalvecespedes.imposiciones.models.Cliente;
import lxdeveloper.monsalvecespedes.imposiciones.repositories.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ImposicionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImposicionesApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(ClienteRepository clienteRepository) {
		return (args) -> {

			/*
			Cliente cliente1 = new Cliente();
			cliente1.setRut("12.345.678-9");
			cliente1.setNombre("Juan Pérez");
			cliente1.setGiro("Comercial");
			cliente1.setDireccion("Av. Las Condes 1234, Santiago");
			cliente1.setComuna("Las Condes");
			cliente1.setCiudad("Santiago");
			cliente1.setRutRepresentante("98.765.432-1");
			cliente1.setNombreRepresentante("Pedro González");

			Cliente cliente2 = new Cliente();
			cliente2.setRut("23.456.789-0");
			cliente2.setNombre("María Gómez");
			cliente2.setGiro("Industrial");
			cliente2.setDireccion("Calle Catedral 5678, Valparaíso");
			cliente2.setComuna("Valparaíso");
			cliente2.setCiudad("Valparaíso");
			cliente2.setRutRepresentante("10.987.654-3");
			cliente2.setNombreRepresentante("Ana Fernández");


			clienteRepository.save(cliente1);
			clienteRepository.save(cliente2);


			 */
		};
	}
}