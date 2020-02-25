package com.github.tantalor93;

import java.net.InetAddress;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_device_peers")
public class UserDevicePeer {

	@PrimaryKey
	private String id;

	@Column("allowed_ips")
	private InetAddress allowedIps;

	@Column("public_key")
	private String publicKey;

	@Column("device_id")
	private String deviceId;

	@Column("customer_id")
	private String customerId;

	public UserDevicePeer() {
	}

	public UserDevicePeer(String id, InetAddress allowedIps, String publicKey, String deviceId,
			String customerId) {
		this.id = id;
		this.allowedIps = allowedIps;
		this.publicKey = publicKey;
		this.deviceId = deviceId;
		this.customerId = customerId;
	}

	public String getId() {
		return id;
	}

	public InetAddress getAllowedIps() {
		return allowedIps;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getCustomerId() {
		return customerId;
	}
}
