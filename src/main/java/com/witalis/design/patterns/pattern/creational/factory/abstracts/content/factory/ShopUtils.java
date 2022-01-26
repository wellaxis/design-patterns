package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

/**
 * Desc: Shop utilities
 * User: Wellaxis
 * Date: 31.12.2021
 */
public final class ShopUtils {

    public static BaseShop create(ShopRank rank, String name) {
        return switch (rank) {
            case WORK -> new BusinessShop(name);
            case HOME -> new EverydayShop(name);
            case GAME -> new PrestigeShop(name);
        };
    }
}
