package netty.chat.init;

import netty.chat.client.ChatClient;

public class ChatClientInit {

	public static void main(String[] args) {
		new ChatClient("localhost", 8000).run();

	}

}
