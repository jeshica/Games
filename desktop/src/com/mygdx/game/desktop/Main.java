package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Freegemas;

public class Main {
	public static void main(String[] args) {
		 Freegemas.setPlatformResolver(new DesktopResolver());
		
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Freegemas";
		cfg.useGL30 = true;
		cfg.width = 1024;
		cfg.height = 720;
		
		new LwjglApplication(new Freegemas(), cfg);
	}
}
