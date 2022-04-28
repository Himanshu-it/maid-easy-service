package com.maideasy.repository;

import com.maideasy.entity.MaidDetails
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MaidDetailsRepository : JpaRepository<MaidDetails, UUID>