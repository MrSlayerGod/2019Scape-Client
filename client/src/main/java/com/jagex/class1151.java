package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqj")
public class class1151 extends class978 {

	// $FF: synthetic field
	public final class310 this$0;

	@ObfuscatedName("aqj.k")
	public long field12214;

	@ObfuscatedName("aqj.f")
	public String field12215;

	public class1151(class310 arg0) {
		this.this$0 = arg0;
		this.field12214 = -1L;
		this.field12215 = null;
	}

	@ObfuscatedName("aqj.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= -1445626955;
			this.field12214 = arg0.g8();
		}
		this.field12215 = arg0.fastgstr();
	}

	@ObfuscatedName("aqj.n(Lkr;I)V")
	public void method17727(class309 arg0) {
		arg0.method5262(this.field12214, this.field12215, 0);
	}
}