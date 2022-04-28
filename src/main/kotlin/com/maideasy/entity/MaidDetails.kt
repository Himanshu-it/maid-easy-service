package com.maideasy.entity

import java.util.*
import javax.persistence.*

@Entity
data class MaidDetails (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,
    val firstName: String?,
    val middleName: String?,
    val lastName: String?,
    val aadharNumber: Long?,
    val contactNumber: Long?,
    @Embedded
    val address: Address?
    )