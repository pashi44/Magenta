package com.pashi.Services;



import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Builder


public class StartupService {
private final Logger logger;


@Autowired
public StartupService(Logger  log) {
    this.logger  = log;

}

public void runOnStartUP() {

    logger.info("starting the   service from {}", StartupService.


            );


}


}
