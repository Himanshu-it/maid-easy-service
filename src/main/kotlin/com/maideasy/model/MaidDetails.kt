package com.maideasy.model


import com.maideasy.entity.Address
import com.maideasy.entity.MaidDetails
import java.util.*

data class MaidDetails (
    val id: UUID?,
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val aadharNumber: Long,
    val contactNumber: Long,
    val address: Address
) {
    fun toEntity(): MaidDetails = MaidDetails(
        id, firstName, middleName, lastName, aadharNumber, contactNumber, address
    )
}