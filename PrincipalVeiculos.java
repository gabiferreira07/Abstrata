package ClasseAbstrata;

public class PrincipalVeiculos {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		Onibus mercedes = new Onibus();

		System.out.println("FERRARI: ");
		ferrari.acelerar();
		ferrari.frear();
		ferrari.ligar();
		ferrari.virar();
		
		System.out.println("MERCEDES: ");
		mercedes.acelerar();
		mercedes.frear();
		mercedes.ligar();
		mercedes.virar();
	}
}
