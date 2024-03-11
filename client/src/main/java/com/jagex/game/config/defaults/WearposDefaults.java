package com.jagex.game.config.defaults;

import com.jagex.js5.Js5;
import com.jagex.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("wy")
public class WearposDefaults {

	@ObfuscatedName("wy.k")
	public int[] field7766;

	@ObfuscatedName("wy.f")
	public int field7763 = -1;

	@ObfuscatedName("wy.w")
	public int field7770 = -1;

	@ObfuscatedName("wy.l")
	public int[] field7769;

	@ObfuscatedName("wy.u")
	public int[] field7767;

	public WearposDefaults(Js5 arg0) {
		byte[] var2 = arg0.method6894(DefaultsGroup.field7712.field7708);
		this.method9890(new Packet(var2));
	}

	@ObfuscatedName("wy.e(Lalw;B)V")
	public void method9890(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				if (this.field7766 == null) {
					throw new RuntimeException("");
				}
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.g1();
				this.field7766 = new int[var3];
				for (int var4 = 0; var4 < this.field7766.length; var4++) {
					this.field7766[var4] = arg0.g1();
					if (this.field7766[var4] != 0 && this.field7766[var4] == 2) {
					}
				}
			} else if (var2 == 3) {
				this.field7763 = arg0.g1();
			} else if (var2 == 4) {
				this.field7770 = arg0.g1();
			} else if (var2 == 5) {
				this.field7769 = new int[arg0.g1()];
				for (int var5 = 0; var5 < this.field7769.length; var5++) {
					this.field7769[var5] = arg0.g1();
				}
			} else if (var2 == 6) {
				this.field7767 = new int[arg0.g1()];
				for (int var6 = 0; var6 < this.field7767.length; var6++) {
					this.field7767[var6] = arg0.g1();
				}
			}
		}
	}
}
