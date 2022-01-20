package com.witalis.design.patterns.pattern.behavioral.observer.content.object;

import com.witalis.design.patterns.pattern.behavioral.observer.content.observer.Observer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device, Observer {
    private UUID id;
    private String name;
    private String token;
    private int version;
    private LocalDateTime modifyDate;

    protected Computer(String name, String token, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.token = token;
        this.version = version;
        this.modifyDate = LocalDateTime.now();
    }

    /**
     * Notifiable method to change state by external command.
     * <p/>
     * @param token      the authorization token
     * @param version    the application version
     * @param modifyDate the modification date
     */
    @Override
    public void update(String token, int version, LocalDateTime modifyDate) {
        setToken(token);
        setVersion(version);
        setModifyDate(modifyDate);

        log.info("\t$ Notification update for {} -> {} at {}", getName(), version, modifyDate);
    }

    @Override
    public String toString() {
        return "Device: [" +
            "id='" + id + "', " +
            "name='" + name + "', " +
            "token='" + token + "', " +
            "version='" + version + "', " +
            "modifyDate='" + modifyDate + "'" +
            ']';
    }
}
