package com.targetindia.programs;


import com.targetindia.entity.Employee;
import com.targetindia.exceptions.BlankNameException;
import com.targetindia.exceptions.InvalidIdException;
import com.targetindia.exceptions.LowSalaryException;
import com.targetindia.exceptions.NullNameException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee();


        try {
            e1.setId(6);
            e1.setName("Levi");
            e1.setSalary(50000);
            log.trace("e1 = {}",e1);

        } catch (BlankNameException e) {
            log.warn("Name is blank");
        } catch (NullNameException e) {
            log.warn("Name is NULL");
        }
        catch (InvalidIdException e){
            log.warn("Invalid ID");
        }
        catch (LowSalaryException e){
            log.warn("Low salary");
        }

    }


}
