package ServerContoller;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket servidor = new ServerSocket(9999);

			while (true) {
				Socket miSocket = servidor.accept();

				DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());

				String Mensaje_texto = flujo_entrada.readUTF();				

				//System.out.println("\n" + Mensaje_texto);

				Calculator calcu = new Calculator(Mensaje_texto);
				calcu.Calcular();
				
				Sender.Responder(miSocket);

				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
