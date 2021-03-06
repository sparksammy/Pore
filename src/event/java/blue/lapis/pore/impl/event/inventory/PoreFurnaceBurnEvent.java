/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
 *
 * The MIT License
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
package blue.lapis.pore.impl.event.inventory;

import static com.google.common.base.Preconditions.checkNotNull;

import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.block.Block;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.inventory.ItemStack;
import org.spongepowered.api.event.block.tileentity.FurnaceConsumeFuelEvent;

public class PoreFurnaceBurnEvent extends FurnaceBurnEvent {

    private final FurnaceConsumeFuelEvent handle;

    public PoreFurnaceBurnEvent(FurnaceConsumeFuelEvent handle) {
        super(null, null, -1);
        this.handle = checkNotNull(handle, "handle");
    }

    public FurnaceConsumeFuelEvent getHandle() {
        return this.handle;
    }

    @Override
    public Block getBlock() {
        throw new NotImplementedException("TODO");
    }

    @Override
    @SuppressWarnings("deprecation")
    public Block getFurnace() {
        return this.getBlock();
    }

    @Override
    public ItemStack getFuel() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public int getBurnTime() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setBurnTime(int burnTime) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean isBurning() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setBurning(boolean burning) {
        throw new NotImplementedException("TODO");
    }

    @Override
    public boolean isCancelled() {
        throw new NotImplementedException("TODO");
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new NotImplementedException("TODO");
    }

}
