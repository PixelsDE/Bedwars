package gamestates;

import java.util.ArrayList;

import Bedwars.Main;
import methods.Settings;
import methods.Var;
import org.bukkit.plugin.Plugin;

public class GameStateHandler {

	private static GameState current;
	private static ArrayList<GameState> states = new ArrayList<>();

	public GameStateHandler() {
		if (Settings.editmode == false) {
			states.add(new LobbyState());
			states.add(new IngameState(Main.getPlugin()));
		}else {

		}
	}

	public static void setGameState(int id) {
		if (Settings.editmode == false) {
			if (current != null)
				current.end();
			current = states.get(id);
			current.init();

		}
	}
	
	
	public static GameState getCurrentState() {
		return current;
	}

}
