package com.github.tantalor93;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface BenkyRepository  extends CassandraRepository<UserDevicePeer, String> {
}
