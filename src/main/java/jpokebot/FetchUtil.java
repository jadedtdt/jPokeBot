package jpokebot;

public class FetchUtil {

	public final static String ID_TO_NAME_ANCHOR = "https://github.com/fanzeyi/Pokemon-DB/blob/master/img/";
	public final static String GIF_ANCHOR = "https://play.pokemonshowdown.com/sprites/xyani/";
	
	public static String getGif(String name) {
		// Preprocessing because I have trust issues
		name = name.toLowerCase();
		
		return GIF_ANCHOR + name + ".gif";		
	}
}
