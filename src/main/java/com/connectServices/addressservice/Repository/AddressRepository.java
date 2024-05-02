package com.connectServices.addressservice.Repository;

import com.connectServices.addressservice.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address,Integer> {

            // here can't use employeeId directly, the named parameter of employeeId, which is currentEmpId can be use
    @Query(nativeQuery = true,value = "SELECT  ea.id,ea.first_lane,ea.last_lane,ea.state,ea.zip FROM  employee_service.address ea join  employee_service.employee em on em.id = ea.employee_id where ea.employee_id = :currentEmpId")
    Address findAddressByEmployeeId(@Param("currentEmpId") int employeeId);
}
