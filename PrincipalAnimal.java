package ClasseAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
	
		Lobo lobo = new Lobo();
		Leao leao = new Leao();
		Tigre tigre = new Tigre();
		Cachorro cao = new Cachorro();
		Gato cat = new Gato();
		
		lobo.setNome("Nome: Lobinho");
		lobo.setSexo("Sexo: Masculino");
		lobo.setRaca("Raça: Lobo-Guará");
		System.out.println("----- ANIMAL 1 -----");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());

		
		leao.setNome("Nome: Leo");
		leao.setSexo("Sexo: Masculino");
		leao.setRaca("Raça: Leão");
		System.out.println("----- ANIMAL 2 -----");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());

		
		tigre.setNome("Nome: tigrão");
		tigre.setSexo("Sexo: Masculino");
		tigre.setRaca("Raça: tigre");
		System.out.println("----- ANIMAL 3 -----");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());

		
		cao.setNome("Nome: dog");
		cao.setSexo("Sexo: Masculino");
		cao.setRaca("Raça: labrador");
		System.out.println("----- ANIMAL 4 -----");
		System.out.println(cao.getNome());
		System.out.println(cao.getSexo());
		System.out.println(cao.getRaca());
		
		cat.setNome("Nome: liz");
		cat.setSexo("Sexo: Femea");
		cat.setRaca("Raça: gato siames");
		System.out.println("----- ANIMAL 5 -----");
		System.out.println(cat.getNome());
		System.out.println(cat.getSexo());
		System.out.println(cat.getRaca());
		
	}

}
