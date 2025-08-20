package com.pashi.Models;


import lombok.Builder;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Builder
public class User {
    protected   Long Id;

    protected   String Name;
}
