package cuchaz.enigma.gui.config;

import cuchaz.enigma.source.DecompilerService;
import cuchaz.enigma.source.Decompilers;

public enum Decompiler {
	CFR("CFR", Decompilers.CFR),
	PROCYON("Procyon", Decompilers.PROCYON),
	BYTECODE("Bytecode", Decompilers.BYTECODE),
	TOKENIZING_DISASSEMBLER("Tokenizing Disassembler", Decompilers.TOKENIZING_DISASSEMBLER);

	public final DecompilerService service;
	public final String name;

	Decompiler(String name, DecompilerService service) {
		this.name = name;
		this.service = service;
	}
}
