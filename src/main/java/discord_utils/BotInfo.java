package discord_utils;

public class BotInfo {

	private String username;
	private String token;
	
	public BotInfo() {
		this.setUsername(null);
		this.setToken(null);
	}
	
	public BotInfo(String username, String token) {
		this.setUsername(username);
		this.setToken(token);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
