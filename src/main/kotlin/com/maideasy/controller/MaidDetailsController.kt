package com.maideasy.controller

import com.maideasy.entity.MaidDetails
import com.maideasy.service.MaidDetailsService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin
class MaidDetailsController(private val maidDetailsService: MaidDetailsService) {

    @PostMapping("/api/maid-details")
    fun addMaidDetails(@RequestBody maidDetails: MaidDetails): MaidDetails {
        return maidDetailsService.saveMaidDetails(maidDetails)
    }

    @GetMapping("/api/maid-details/{id}")
    fun getMaidDetails(@PathVariable("id") maidId: String): MaidDetails {
        return maidDetailsService.findMaidDetailsById(UUID.fromString(maidId))
    }

    @DeleteMapping("/api/maid-details/{id}")
    fun removeMaidDetails(@PathVariable("id") maidId: String) {
        maidDetailsService.deleteMaidDetailsById(UUID.fromString(maidId))
    }
}

