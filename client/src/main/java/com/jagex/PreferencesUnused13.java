package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("anh")
public class PreferencesUnused13 extends PreferencesOption {

	public PreferencesUnused13(ClientOptions arg0) {
		super(arg0);
	}

	public PreferencesUnused13(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("anh.o(I)V")
	public void method18706() {
		if (this.field8416 < -3) {
			this.field8416 = this.method14069();
		}
	}

	@ObfuscatedName("anh.e(B)I")
	public int method14069() {
		return -2;
	}

	@ObfuscatedName("anh.n(II)I")
	public int method14070(int arg0) {
		return 3;
	}

	@ObfuscatedName("anh.k(II)V")
	public void method14072(int arg0) {
		this.field8416 = arg0;
	}

	@ObfuscatedName("anh.s(I)I")
	public int method18707() {
		return this.field8416;
	}
}
