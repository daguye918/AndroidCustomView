package com.aigestudio.custom.firstblood;

/**
 * 数据操作接口方法声明
 *
 * @author AigeStudio{@link http://aigestudio.com/?p=75}
 * @since 2016-08－12
 */
public interface IDataSet<T> {
    /**
     * 设置数据集
     *
     * @param data 数据集
     */
    void setData(T data);

    /**
     * 设置选中的数据项在数据集中的位置
     *
     * @param position 选中的数据在数据集中的位置
     */
    void setSelectedPosition(int position);
}