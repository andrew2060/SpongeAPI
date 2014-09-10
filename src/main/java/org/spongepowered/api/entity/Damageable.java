/**
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2014 SpongePowered <http://spongepowered.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity;

/**
 * Describes an {@link Entity} that has a health value and can take damage
 */
public interface Damageable {

    /**
     * Damages the entity by a specified amount, with knockback.
     *
     * @param amount the amount of damage to deal to the {@code Damageable}
     */
    void damage(double amount);
    
    /**
     * Damages the entity by a specified amount.
     * 
     * @param amount the amount of damage to deal to the {@code Damageable}
     * @param knockback whether the attack should cause a knockback to occur
     */
    void damage(double amount, boolean knockback);
    
    //TODO: add damage methods that accept something akin to a DamageCause, depending on what we end up using for that

    /**
     * Gets the health of the entity.
     *
     * @return the health of the {@code Damageable}
     */
    double getHealth();

    /**
     * Gets the maximum health currently set for the entity
     *
     * @return the maximum health of the {@code Damageable}
     */
    double getMaxHealth();

    /**
     * Sets the health of the {@code Damageable}.
     *
     * @param health the health to set for the {@code Damageable}, from 0 to
     *               the value of {@link #getMaxHealth()}, inclusive
     *
     * @throws IllegalArgumentException if the health to set is greater than
     * the {@code Damageable}'s maximum health or negative
     */
    void setHealth(double health) throws IllegalArgumentException;

    /**
     * Sets the maximum health of the {@code Damageable}.
     *
     * @param health the maximum health to set for the {@code Damageable}
     *
     * @throws IllegalArgumentException if the parameter health is negative or
     * greater than {@link Float#MAX_VALUE}
     */
    void setMaxHealth(double health) throws IllegalArgumentException;
}
