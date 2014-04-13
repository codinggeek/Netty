package netty.chat.init;

import netty.chat.server.ChatServer;

public class ChatServerInit {

	public static void main(String[] args) {
		new ChatServer(8000).run();

	}

}
