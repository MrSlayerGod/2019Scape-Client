package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gl")
public class class192 implements class203 {

	// $FF: synthetic field
	public final class201 this$0;

	@ObfuscatedName("gl.e")
	public final int field1916;

	@ObfuscatedName("gl.n")
	public final int field1915;

	public class192(class201 arg0, Packet arg1) {
		this.this$0 = arg0;
		int var3 = arg1.g2();
		if (var3 == 65535) {
			this.field1916 = -1;
			this.field1915 = 0;
		} else {
			this.field1916 = var3;
			this.field1915 = arg1.g4s();
		}
	}

	@ObfuscatedName("gl.e(Lgq;B)V")
	public void method3371(class191 arg0) {
		if (this.field1916 != -1) {
			try {
				arg0.method3394().method2804((VarBitType) this.this$0.field1943.method294().get(this.field1916), this.field1915);
			} catch (VarBitOverflowException var3) {
			}
		}
	}
}
