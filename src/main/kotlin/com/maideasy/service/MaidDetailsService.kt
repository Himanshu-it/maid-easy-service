package com.maideasy.service

import com.maideasy.repository.MaidDetailsRepository
import com.maideasy.entity.MaidDetails
import org.springframework.stereotype.Service
import java.util.*

@Service
class MaidDetailsService(private val maidDetailsRepository: MaidDetailsRepository) {
    fun saveMaidDetails(maidDetails: MaidDetails): MaidDetails {
        return maidDetailsRepository.save(maidDetails);
    }

    fun deleteMaidDetailsById(maidId: UUID) {
        maidDetailsRepository.deleteById(maidId)
    }

    fun findMaidDetailsById(maidId: UUID) : MaidDetails {
        return maidDetailsRepository.findById(maidId).get()
    }
}