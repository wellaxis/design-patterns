package com.witalis.design.patterns.pattern.structural.composite.content;

import com.witalis.design.patterns.pattern.structural.composite.content.composite.ComputerClub;
import com.witalis.design.patterns.pattern.structural.composite.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.Map;

/**
 * Desc: Invoker composite class
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
public class CompositeInvoker {

    public void invoke() {
        log.info("\tComposite: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Computer laptop = new Laptop("Lenovo-Yoga", "Lenovo Yoga 7 27ACH6");
            laptop.use();
            // table
            Computer tablet = new Tablet("Lenovo-Tab", "Lenovo Tab M10");
            tablet.use();
            // mobile
            Computer mobile = new Mobile("Lenovo-Vibe", "Lenovo Vibe K5 Note Pro");
            mobile.use();

            log.info("");

            // club
            ComputerClub club = new ComputerClub("Victory");
            club.add(laptop);
            club.add(tablet);
            club.add(mobile);
            club.add(new Laptop("Test-Laptop"));
            club.add(new Mobile("Test-Mobile"));
            club.add(new Tablet("Test-Tablet"));

            club.output();
            club.use();

            log.info("");

            // sold laptop
            Computer device = (Computer) club.get(laptop.getId());
            log.info("\t{}# Club need to sold this laptop: {}", device.getName(), device.getComments());
            club.remove(laptop.getId());

            // ban all tablets
            log.info("\t* All tablets should be deactivated!!!");
            var tablets = club.getDevices().entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Tablet)
                .map(Map.Entry::getValue)
                .map(Tablet.class::cast)
                .map(Computer::getId)
                .toList();
            tablets.forEach(club::remove);
            log.info("\t* There are {} tablets have been banned.", tablets.size());

            club.output();
            club.use();

            log.info("");

            club.clear();
            club.output();
            club.use();

            log.info("");

        } catch (Exception e) {
            log.error("\tComposite: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tComposite: end, time = {} ms", (end - begin) / 1000);
    }
}
