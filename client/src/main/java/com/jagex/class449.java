package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pc")
public class class449 {

	@ObfuscatedName("pc.e")
	public final class445 field4478;

	@ObfuscatedName("pc.n")
	public final int field4477;

	@ObfuscatedName("pc.m")
	public final int field4476;

	public class449(Packet arg0) {
		this.field4478 = (class445) class686.method1897(class445.method6978(), arg0.g1());
		this.field4477 = arg0.g4s();
		if (class445.field4434 == this.field4478) {
			this.field4476 = this.field4477;
		} else {
			this.field4476 = arg0.g4s();
		}
	}

	@ObfuscatedName("pc.e(B)Lpj;")
	public class445 method7080() {
		return this.field4478;
	}

	@ObfuscatedName("pc.n(I)I")
	public int method7081() {
		return this.field4477;
	}

	@ObfuscatedName("pc.m(B)I")
	public int method7091() {
		return this.field4476;
	}
}