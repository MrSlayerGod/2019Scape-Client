package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asl")
public class SubInterfaceActiveLoc extends SubInterface {

	@ObfuscatedName("asl.w")
	public final class675 field12429;

	public SubInterfaceActiveLoc(int arg0, int arg1, class675 arg2) {
		super(arg0, arg1);
		this.field12429 = arg2;
	}

	@ObfuscatedName("asl.e(B)Z")
	public boolean method18183() {
		Location var1 = this.field12429.method10760();
		if (var1 == null) {
			return false;
		} else {
			ScriptRunner.method15112(ClientTriggerType.field7264, this.field11571, -1, var1);
			return true;
		}
	}
}