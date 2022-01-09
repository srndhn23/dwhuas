package com.susi.dwh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DwhApplication

fun main(args: Array<String>) {
	runApplication<DwhApplication>(*args)
}
