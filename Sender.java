package ServerContoller;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sender {

	private static int suma;
	
	public Sender(int a) {

		this.suma = a;
	}

	public static void Responder(Socket soc) {

		try {
//			ServerSocket server = new ServerSocket(9999);
//			Socket miSocket = server.accept();			

			DataOutputStream flujo_salida = new DataOutputStream(soc.getOutputStream());

			flujo_salida.write(suma);

			flujo_salida.close();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
		System.out.println(e1.getMessage());
		}
	}
}
