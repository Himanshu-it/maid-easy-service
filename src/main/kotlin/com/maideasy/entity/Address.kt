package com.maideasy.entity

import javax.persistence.Embeddable

@Embeddable
data class Address(val firstLine: String?, val secondLine: String?, val city: String?, val pinCode: Int?)
