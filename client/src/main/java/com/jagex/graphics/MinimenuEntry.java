package com.jagex.graphics;

import com.jagex.core.datastruct.SecondaryNode;
import deob.ObfuscatedName;

@ObfuscatedName("arm")
public class MinimenuEntry extends SecondaryNode {

	@ObfuscatedName("arm.l")
	public final String field12301;

	@ObfuscatedName("arm.u")
	public final String field12297;

	@ObfuscatedName("arm.z")
	public final boolean field12308;

	@ObfuscatedName("arm.p")
	public final int field12298;

	@ObfuscatedName("arm.d")
	public final int field12303;

	@ObfuscatedName("arm.c")
	public final long field12300;

	@ObfuscatedName("arm.r")
	public final int sceneBaseTileX;

	@ObfuscatedName("arm.v")
	public final int sceneBaseTileZ;

	@ObfuscatedName("arm.o")
	public final boolean field12299;

	@ObfuscatedName("arm.s")
	public final long field12305;

	@ObfuscatedName("arm.y")
	public final boolean field12306;

	@ObfuscatedName("arm.q")
	public int menuAction;

	@ObfuscatedName("arm.x")
	public String field12296;

	public MinimenuEntry(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
		this.field12301 = arg1;
		this.field12297 = arg0;
		this.field12298 = arg2;
		this.menuAction = arg3;
		this.field12303 = arg4;
		this.field12300 = arg5;
		this.sceneBaseTileX = arg6;
		this.sceneBaseTileZ = arg7;
		this.field12308 = arg8;
		this.field12299 = arg9;
		this.field12305 = arg10;
		this.field12306 = arg11;
	}

	@ObfuscatedName("arm.e(I)J")
	public long method19370() {
		return this.field12300;
	}

	@ObfuscatedName("arm.n(I)J")
	public long method19368() {
		return this.field12305;
	}
}
