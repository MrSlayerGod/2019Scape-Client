package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ant")
public class PreferencesUnknown8 extends PreferencesOption {

	public PreferencesUnknown8(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnknown8(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ant.o(B)V")
	public void method18700() {
		if (this.field8416 != 0 && this.field8416 != 1) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("ant.e(B)I")
	public int method14069() {
		return 1;
	}

	@ObfuscatedName("ant.n(II)I")
	public int method14070(int arg0) {
		return 1;
	}

	@ObfuscatedName("ant.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("ant.s(I)I")
	public int method18701() {
		return this.field8416;
	}
}
