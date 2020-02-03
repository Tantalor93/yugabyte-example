package com.github.tantalor93;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("BENKY")
public class Sample {

	@PrimaryKey("NUM")
	private int num;

	@Column("UNQ")
	private int unq;

	private Sample() {
	}

	public Sample(int num, int unq) {
		this.num = num;
		this.unq = unq;
	}

	public int getUnq() {
		return unq;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "Sample{" +
				"num=" + num +
				", unq=" + unq +
				'}';
	}
}
