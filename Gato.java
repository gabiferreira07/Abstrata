package ClasseAbstrata;

public class Gato extends Animal{

	@Override
	public void dormir() {
		System.out.println("Dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("Caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Uivandoo");
	}
}

