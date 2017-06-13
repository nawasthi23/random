package in.inishant.core;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Socket Skt;
        String host = "209.253.205.102";
        int i = 2220; // port no.

             try {
                System.out.println("Looking for "+ i);
                Skt = new Socket(host, i);
                System.out.println("There is a Server on port "
                + i + " of " + host);
             }
             catch (UnknownHostException e) {
                System.out.println("Exception occured"+ e);

             }
             catch (IOException e) {
                 System.out.println("port is not used");

             }

	}

}
