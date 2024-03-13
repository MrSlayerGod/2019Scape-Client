package com.jagex.game.client;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.group.PlayerGroupResourceProvider;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("d")
public final class ClientPlayerGroupResourceProvider implements PlayerGroupResourceProvider {

	@ObfuscatedName("d.e(B)Ladd;")
	public VarTypeList method293() {
		return Client.field8485;
	}

	@ObfuscatedName("d.n(B)Ladd;")
	public VarTypeList method291() {
		return Client.field3415;
	}

	@ObfuscatedName("d.m(I)Laor;")
	public VarBitTypeList method294() {
		return Client.field8736;
	}

	@ObfuscatedName("d.k(B)Lwq;")
	public SkillDefaults method295() {
		return Client.skillDefaults;
	}
}
