package com.jagex.audio;

import com.jagex.core.io.Packet;
import com.jagex.game.cutscene.CutsceneAction;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agb")
public class SoundSongCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agb.n")
	public final int field10318;

	@ObfuscatedName("agb.m")
	public final int field10319;

	public SoundSongCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10318 = arg0.g2();
		this.field10319 = arg0.g1();
	}

	@ObfuscatedName("agb.n(I)V")
	public void method2890() {
		Client.field1798.method3174(this.field10318);
	}

	@ObfuscatedName("agb.k(I)Z")
	public boolean method2891() {
		Client.field1798.method3239(this.field10318, this.field10319);
		return true;
	}
}
